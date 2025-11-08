// src/App.js
import React from "react";

const fetchApi = async () => {
  console.log("Hai cliccato il bottone!");
  try {
    const response = await fetch("http://localhost:8080/custom");
    const text = await response.text();
    console.log("Response: ", text);
    alert(text);
  } catch (e) {
    console.error("Errore fetch:", e);
    alert("Errore di rete. Controlla console e backend.");
  }
};

function App() {
  return (
    <div style={{ padding: 20 }}>
      <h2>React + Spring Boot CORS Demo</h2>
      <button onClick={fetchApi}>Chiama /custom</button>
    </div>
  );
}

export default App;