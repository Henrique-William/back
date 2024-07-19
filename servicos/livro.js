const fs = require("fs");

function getTodosLivros() {
  return JSON.parse(fs.readFileSync("livros.json"));
}

function getLivroPorID(id) {
  const livros = JSON.parse(fs.readFileSync("livros.json"));
  const livroFiltrado = livros.filter((livro) => livro.id === id)[0];
  //por filtrar um obj por um apesquisa unica (id) de uma array, será retornado uma array de apenas 1 indice [0]

  return livroFiltrado;
}

function insereLivro(livroNovo) {
  const livros = JSON.parse(fs.readFileSync("livros.json"));

  const novaListaDeLivros = [...livros, livroNovo]; //spreading js
  fs.writeFileSync("livros.json", JSON.stringify(novaListaDeLivros));
}

function modificaLivro(modificacoes, id) {
  let livrosAtuais = JSON.parse(fs.readFileSync("livros.json"));
  const indiceModificado = livrosAtuais.findIndex(livro => livro.id === id) //filtra o indice do id
  
  const conteudoMudado = { ...livrosAtuais[indiceModificado], ...modificacoes }
  //livrosAtuais[indiceModificado] = {"id": 2, "nome": "Livro muito legal"}
  //modificacoes = {"nome": "Livro mucho legal"}
  //irá fazer a comparação e atualizaar só o que foi modificado

  livrosAtuais[indiceModificado] = conteudoMudado;
  fs.writeFileSync("livros.json", JSON.stringify(livrosAtuais))
} 

function deletaLivroPorID(id) {
  const livros = JSON.parse(fs.readFileSync("livros.json"));

  const livroFiltrado = livros.filter((livro) => livro.id !== id);
  fs.writeFileSync("livros.json", JSON.stringify(livroFiltrado));
}

module.exports = {
  getTodosLivros,
  getLivroPorID,
  insereLivro,
  modificaLivro,
  deletaLivroPorID
};
