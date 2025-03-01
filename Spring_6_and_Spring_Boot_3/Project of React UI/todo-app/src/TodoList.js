// TodoList.js
import React, { useState, useEffect } from 'react';
import './TodoList.css';

function TodoList() {
  const [todos, setTodos] = useState([]);
  const [name, setName] = useState('');
  const [description, setDescription] = useState('');
  const [editingTodo, setEditingTodo] = useState(null);

  useEffect(() => {
    fetchTodos();
  }, []);

  const fetchTodos = async () => {
    try {
      const response = await fetch('http://localhost:8080/api/todos');
      if (response.ok) {
        const data = await response.json();
        setTodos(data);
      } else {
        console.error('Failed to fetch todos');
      }
    } catch (error) {
      console.error('Error:', error);
    }
  };

  const handleSubmit = async (e) => {
    e.preventDefault();
    const todo = { name, description };

    try {
      const url = editingTodo
        ? `http://localhost:8080/api/todos/${editingTodo.id}`
        : 'http://localhost:8080/api/todos';

      const method = editingTodo ? 'PUT' : 'POST';

      const response = await fetch(url, {
        method: method,
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify(todo),
      });

      if (response.ok) {
        fetchTodos();
        setName('');
        setDescription('');
        setEditingTodo(null);
      } else {
        console.error('Failed to save todo');
      }
    } catch (error) {
      console.error('Error:', error);
    }
  };

  const handleEdit = (todo) => {
    setEditingTodo(todo);
    setName(todo.name);
    setDescription(todo.description);
  };

  const handleDelete = async (id) => {
    try {
      const response = await fetch(`http://localhost:8080/api/todos/${id}`, {
        method: 'DELETE',
      });

      if (response.ok) {
        fetchTodos();
      } else {
        console.error('Failed to delete todo');
      }
    } catch (error) {
      console.error('Error:', error);
    }
  };

  return (
    <div className="todo-container">
      <h2>{editingTodo ? 'Edit Todo' : 'Add a New Todo'}</h2>
      <form onSubmit={handleSubmit}>
        <div className="form-group">
          <label htmlFor="name">Name:</label>
          <input type="text" id="name" value={name} onChange={(e) => setName(e.target.value)} required />
        </div>
        <div className="form-group">
          <label htmlFor="description">Description:</label>
          <textarea id="description" value={description} onChange={(e) => setDescription(e.target.value)} required></textarea>
        </div>
        <button type="submit">{editingTodo ? 'Update Todo' : 'Add Todo'}</button>
      </form>
      <ul>
        {todos.map((todo) => (
          <li key={todo.id}>
            <strong>{todo.name}</strong>: {todo.description}
            <button onClick={() => handleEdit(todo)}>Edit</button>
            <button onClick={() => handleDelete(todo.id)}>Delete</button>
          </li>
        ))}
      </ul>
    </div>
  );
}

export default TodoList;
