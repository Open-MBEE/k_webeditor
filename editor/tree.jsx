import React from 'react';
// import PropTypes from 'prop-types';
import {StyleRoot} from 'radium';
import {Treebeard, decorators} from 'react-treebeard'

var styles =  {
    component: {
        width: '100%',
        display: 'inline-block',
        verticalAlign: 'top',
        padding: '5px',
        '@media (max-width: 640px)': {
            width: '100%',
            display: 'block'
        }
    }
};
// Tree Code - Define Styling

decorators.Header = ({style, node}) => {
    var iconType;
    switch(node.type){
        case 'class':
            iconType='file text outline';
            break;
        case 'property':
            iconType='chevron right outline';
            break;
        case 'constraint':
            iconType='file code outline';
            break;
        default:
            iconType='cogs';

    }
    const iconClass = `${iconType} icon`;
    const iconStyle = {marginRight: '5px'};

    return (
        <div style={style.base}>
            <div style={style.title}>
                <i className={iconClass} style={iconStyle}/>
                {node.name}
            </div>
        </div>
    )

}

class KTree extends React.Component {
    constructor(props) {
        super();
        this.state = {data: props.treeData};
        this.onToggle = this.onToggle.bind(this);
    }
    componentWillReceiveProps(props) {
        this.state = {data: props.treeData};
    }
    onToggle(node, toggled){
        const {cursor} = this.state;

        if (cursor) {
            cursor.active = false;
        }

        node.active = true;
        if (node.children) {
            node.toggled = toggled;
        }

        this.setState({cursor: node});
        var editor = ace.edit('editor');
        let l = node.start.line;
        let c = node.start.col;
        editor.focus();
        editor.gotoLine(l, c, true);
        console.log(node);
    }


    render(){
        const {data: stateData, cursor} = this.state;
        return (
            <StyleRoot>
                <div style={styles.component}>
                    <Treebeard data={stateData}
                               decorators={decorators}
                               onToggle={this.onToggle}/>
                </div>
            </StyleRoot>
        )
    }

}

export default KTree;
