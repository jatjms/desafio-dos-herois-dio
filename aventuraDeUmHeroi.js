class Heroi {
    constructor(nome, idade, tipo) {
      this.nome = nome;
      this.idade = idade;
      this.tipo = tipo;
    }
  
    atacar() {
      let ataque;
  
      switch (this.tipo) {
        case "mago":
          ataque = "usou magia";
          break;
        case "guerreiro":
          ataque = "usou espada";
          break;
        case "monge":
          ataque = "usou artes marciais";
          break;
        case "ninja":
          ataque = "usou shuriken";
          break;
        default:
          ataque = "usou uma habilidade desconhecida";
      }
  
      console.log(`o ${this.tipo} ${this.nome} atacou usando ${ataque}`);
    }
  }
  
  // Criando instâncias da classe
  const mago = new Heroi("Gandalf", 2000, "mago");
  const guerreiro = new Heroi("Conan", 30, "guerreiro");
  const monge = new Heroi("Liu Kang", 35, "monge");
  const ninja = new Heroi("Hattori Hanzo", 32, "ninja");
  
  // Chamando o método atacar
  mago.atacar();
  guerreiro.atacar();
  monge.atacar();
  ninja.atacar();