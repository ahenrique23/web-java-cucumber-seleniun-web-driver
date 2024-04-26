#### Estrutura do projeto

        teste_datum/
            ├── src/
            │   ├── main/
            │   │   ├── java/
            │   │   │   ├── pages/
            │   │   │   │   └── ArquivosPage.java
            │   │   │   ├── steps/
            │   │   │   │   └── ArquivosSteps.java
            │   │   │   ├── utils/
            │   │   │   │   └── ArquivosUtils.java
            │   ├── test/
            │   │   ├── java/
            │   │   │   └── runners/
            │   │   │       └── RunCucumberTest.java
            │   │   └── resources/
            │   │       └── elements/
            │   │           └── Arquivoselements.json
            │   └── resources/
            │       └── features/
            │           └── Arquivos.feature
            └── pom.xml


#### Para rodar o projeto

    1º Certifiquese de ter o java JDK instalado e configurado em sua maquina no seu PATH 
        para confirmar isso, abra o prompt e digite:
            java -version
        
        Se estiver configurado corretamente ele ira mostrar a versão do java, conforme abaixo:
            C:\Users\ahenr>java -version
            java version "1.8.0_361"
            Java(TM) SE Runtime Environment (build 1.8.0_361-b09)
            Java HotSpot(TM) 64-Bit Server VM (build 25.361-b09, mixed mode)

        Se não tiver o java instalado e configurado siga os passos abaixo:
            Faça o dowload do java e instale:
            https://www.oracle.com/br/java/technologies/downloads/

            Após instalar o JDK, você precisará configurar as variáveis de ambiente. 
            Para fazer isso:
            Abra o Painel de Controle.
            Vá para Sistema e Segurança -> Sistema -> Configurações avançadas do sistema.
            Clique em "Variáveis de Ambiente...".
            Na seção "Variáveis de sistema", encontre a variável "Path" e selecione-a.
            Clique em "Editar...".
            Na janela de edição, clique em "Novo" e adicione o caminho para a pasta "bin" 
            do JDK. O caminho padrão pode ser algo como 
            C:\Program Files\Java\jdk1.x.x_xx\bin, onde x.x.xx é a versão do JDK instalada.
            Clique em "OK" em todas as janelas para aplicar as alterações.
            Para verificar se o Java foi configurado corretamente, abra um novo prompt de 
            comando e digite java -version novamente. Você deverá ver as informações 
            sobre a versão do Java sem erros.

        2º Abra o projeto na IDE de sua preferência:
            IntelliJ IDEA
            eclipse
            NetBeans
        
        3° Clique com o botão direito no arquivo pom.xml e selecione:
            Reload project
            
            Isso instalará as dependencias necessárias para rodar o projeto

        4° Para rodar o projeto:
            Clique com o botão direito do mouise no arquivo RunCucumberTest no caminho 
            src/test/java/runners

            Selecione Run 'RunCucumberTest'

            Isso rodará todos os testes pois é assim que esta configurado, mas se quiser alterar
            para rodar 1 arquivo de cada vez siga os passos abaixo:

            No arquivo RunCucumberTest, temos a anotação:
                @RunWith(Cucumber.class)
                @CucumberOptions(
                features = "src/test/resources/features/",
                glue = "steps"
            
            Com a configuração acima ele rodará todas features que estão na pasta features
            Para rodar apenas 1 ou mais features, basta passar apos a / o nome da feature
            que quer rodar:
                @RunWith(Cucumber.class)
                @CucumberOptions(
                features = "src/test/resources/features/login",
                glue = "steps"

        Seguindo os passos descritos deverá ser capaz de rodar o projeto sem problemas!!!!