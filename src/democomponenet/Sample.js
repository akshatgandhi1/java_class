import React from "react";

export function Sample(props){
    return (
    <div>
        <h1> Welcome to class {props.name} -- {props.name1} -- {props.children}</h1>
        <h2>wlecome to</h2>
    </div>
    ) 
}

 const Sample1 =(props) => <h1>welcome {props.name} -- {props.name1}</h1> ;

export default Sample1;
 