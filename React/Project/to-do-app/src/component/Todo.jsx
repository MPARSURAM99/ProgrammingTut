import React, { useState } from "react";
import "../index.css";

const generateId = () => {
  return Math.floor(Math.random() * 100);
};

const Todo = () => {
  const [inputtext, setInputtext] = useState("");
  const [tasktodo, setTasktodo] = useState([]);
  const [activeIndex, setActiveIndex] = useState(null);

  const readTextInput = (e) => {
    setInputtext(e.target.value);
  };

  const addTaskToDo = () => {
    if (inputtext === "") {
      alert("You must add a task to do 😡😡!!!");
    } else {
      setTasktodo((tasktodo) =>
        tasktodo.concat({
          text: inputtext,
          id: generateId(),
        })
      );
    }
    setInputtext("");
  };

  const removeTask = (id) => {
    setTasktodo((tasktodo) => tasktodo.filter((t) => t.id !== id));
  };

  const markAsDone = (id) => {
    setActiveIndex(activeIndex === id ? null : id);
  };

  return (
    <>
      <div className="container">
        <input
          type="text"
          value={inputtext}
          onChange={(e) => readTextInput(e)}
          placeholder="Add a task to do!"
          className="inputBox"
        />

        <button onClick={() => addTaskToDo()} className="addBtn">
          Add
        </button>

        <ul className="todoList">
          {tasktodo.map(({ text, id }) => {
            return (
              <li key={id} className="task">
                <span
                  id="taskText"
                  className={activeIndex === id ? "active" : ""}
                  onClick={() => markAsDone(id)}
                >
                  {text}
                </span>
                <button className="removeBtn" onClick={() => removeTask(id)}>
                  X
                </button>
              </li>
            );
          })}
        </ul>
      </div>
    </>
  );
};

export default Todo;
