# spring-inject-dependency

Exemplo simples e objetivo do uso do Framework Spring, para implementação de injeção de dependências.

Estrutura do projeto:


```shell
├── mvnw
├── mvnw.cmd
├── pom.xml
├── README.md
└── src/main/java/br/fatec/di
    ├── acoes
    │   └── Acoes.java
    ├── Application.java
    ├── caracteristicas
    │   ├── Brasileiro.java
    │   ├── Japones.java
    │   └── Mestico.java
    ├── dependenciaconfig
    │   └── FabricaPessoas.java
    └── templates
        ├── PessoaBrasil.java
        ├── PessoaJapao.java
        ├── Pessoa.java
        └── PessoaMestico.java
```



```
Carlos: 
Joga Bola: excelente
Mauricio: 
Joga bola muito bem
Shinja Kagawa NAO JOGA BOLA porque eh Japones
Mauricio: 
Fala japones: muito bem
Kagawa: 
Fala japones: excelente
Carlos NAO FALA JAPONES porque eh Brasileiros
Mauricio: 
Fala portugues: muito bem
Carlos: 
Fala portugues: excelente
Shinja Kagawa NAO FALA PORTUGUES porque eh Japones
Mauricio: 
Fala japones: Muito bem
Fala portugues: Muito bem
Traduz: Muito bem
Carlos NAO FALA JAPONES, logo nao traduz
Shinji Kagawa NAO FALA PORTUGUES, logo nao traduz
```