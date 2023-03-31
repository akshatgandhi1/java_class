// import logo from './logo.svg';
// import './App.css';

import Sample1 from "./democomponenet/Sample";
import Example from "./democomponenet/Exapmle";
import { Sample }  from "./democomponenet/Sample";
// import Array from "./democomponenet/Array"

function App() {
  return (
    <div className="App" >
      <h1>Hello world</h1>
      <Sample name="Sachin" name1="m1"><p> hello all</p></Sample>
      <Sample name="rohit" name1="m2"/>
      <Sample1 name="virat" name1="m3"/>
      <Example name="dhoni"/>

    </div>

    
  );
}

export default App;
