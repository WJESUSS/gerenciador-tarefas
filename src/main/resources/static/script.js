const apiUrl = "http://localhost:8080/api/tarefas";

const form = document.getElementById("formTarefa");
const lista = document.getElementById("listaTarefas");

// Função para criar elemento de tarefa
function criarElementoTarefa(tarefa) {
  const li = document.createElement("li");
  li.className = tarefa.concluida ? "concluida" : "";
  li.innerHTML = `
    <div>
      <strong>${tarefa.titulo}</strong> - ${tarefa.descricao} <em>[${tarefa.prioridade}]</em>
    </div>
    <div class="actions">
      <button class="toggle">${tarefa.concluida ? 'Desmarcar' : 'Concluir'}</button>
      <button class="delete">Excluir</button>
    </div>
  `;

  // Concluir/desmarcar
  li.querySelector(".toggle").addEventListener("click", () => toggleTarefa(tarefa));

  // Excluir
  li.querySelector(".delete").addEventListener("click", () => excluirTarefa(tarefa.id));

  return li;
}

// Listar tarefas
async function listarTarefas() {
  lista.innerHTML = '';
  try {
    const res = await fetch(apiUrl);
    const tarefas = await res.json();
    tarefas.forEach(tarefa => lista.appendChild(criarElementoTarefa(tarefa)));
  } catch (err) {
    console.error("Erro ao listar tarefas:", err);
  }
}

// Concluir/desmarcar tarefa
async function toggleTarefa(tarefa) {
  try {
    await fetch(`${apiUrl}/${tarefa.id}`, {
      method: "PUT",
      headers: {"Content-Type": "application/json"},
      body: JSON.stringify({...tarefa, concluida: !tarefa.concluida})
    });
    listarTarefas();
  } catch (err) {
    console.error("Erro ao atualizar tarefa:", err);
  }
}

// Excluir tarefa
async function excluirTarefa(id) {
  try {
    await fetch(`${apiUrl}/${id}`, { method: "DELETE" });
    listarTarefas();
  } catch (err) {
    console.error("Erro ao excluir tarefa:", err);
  }
}

// Criar nova tarefa
form.addEventListener("submit", async e => {
  e.preventDefault();
  const tarefa = {
    titulo: document.getElementById("titulo").value,
    descricao: document.getElementById("descricao").value,
    prioridade: document.getElementById("prioridade").value,
    concluida: false,
    categoria: null
  };

  try {
    await fetch(apiUrl, {
      method: "POST",
      headers: {"Content-Type": "application/json"},
      body: JSON.stringify(tarefa)
    });
    form.reset();
    listarTarefas();
  } catch (err) {
    console.error("Erro ao criar tarefa:", err);
  }
});

// Inicializa
listarTarefas();
