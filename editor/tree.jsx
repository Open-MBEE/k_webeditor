import React from 'react';
// import PropTypes from 'prop-types';
import {StyleRoot} from 'radium';
import {Treebeard, decorators} from 'react-treebeard'

var styles =  {
    component: {
        width: '100%',
        display: 'inline-block',
        verticalAlign: 'top',
        padding: '20px',
        '@media (max-width: 640px)': {
            width: '100%',
            display: 'block'
        }
    }
};
// Tree Code - Define Styling

decorators.Header = ({style, node}) => {
    const iconType = node.children ?  'file folder outline' : 'file code outline';
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

        this.state = props.treeData;
        this.onToggle = this.onToggle.bind(this);
    }

    onToggle(node, toggled){
        const {cursor} = this.state;

        if (cursor){
            cursor.active = false;
        }

        node.active= true;

        if(node.children){
            node.toggled = toggled;
        }
        this.setState({cursor: node});
    }

    render(){
        const {data: stateData, cursor} = this.state;
        return (
            <StyleRoot>
                <div style={styles.component}>
                    <Treebeard data={this.state}
                               decorators={decorators}
                               onToggle={this.onToggle}/>
                </div>
            </StyleRoot>
        )
    }

}

export default KTree;
