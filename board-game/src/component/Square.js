import React from "react";

export default class Square extends React.Component {

  constructor(props) {
    super(props);
    this.state = {
      text: "clickable"
    };
    this.handleClick = this.handleClick.bind(this);
  }

  render() {
    return (
      <button className="square">
        {
            // TODO
        }
      </button>
    );
  }
}
