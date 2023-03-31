import {useState} from 'react'

function MyForm(){

    const [inputs,setInputs] = useState({});

    const handleChange =(event) =>{
        const name=event.target.name;
        const value = event.target.value;
        setInputs(values => ({...values,[name]:value}))
    }
    const handleSubmit = (event) =>{
        event.preventDefault();
        alert(`${inputs}`);
        console.log(inputs);
    }


    return(
     <div align="center">   
    <form onSubmit={handleSubmit}>
        <label>
            Enter your name:
            <input type="text" 
            name="username"
            value={inputs.username || ""}
            onChange={handleChange}
            />
            </label> 
            <br />
            <label>
            Enter your age:
            <input type="number" 
            name="age"
            value={inputs.age || ""}
            onChange={handleChange}
            />
            </label> 
            <br />

            <label>
            Enter your number:
        
            <input type="number" 
            name="number"
            value={inputs.number || ""}
            onChange={handleChange}
            />
            </label> 
            <br />
        enter text
        <textarea  type="text" 
            name="text"
            value={inputs.text || ""}
            onChange={handleChange} >   
        </textarea>       

        <input type="submit"></input>
    </form>
    </div>
    )
}

export default MyForm;