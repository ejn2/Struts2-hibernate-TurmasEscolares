<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="./css/style.css">
    <title>Home</title>
</head>
<body>
    <section class="root">
        <nav class="bar">
            <main id="center-80">
                <h1 class="main-title">Turmas Escolares</h1>
            </main>
        </nav>
        <div class="div-form">
            <div class="close-form"></div>
            
            <form class="form-register" action="" method="post">
                    <h1 class="title-form">Criar nova Turma</h1>

                <div class="form-input">
                    <p class="title-info">Turma</p><br><br>
                        <input type="text" placeholder="Nome para a Turma" name="turmaname" /><br>

                </div>
                <div class="form-input form-input-prof">
                    <p class="title-info">Professor</p><br><br>
                    <input type="text" placeholder="Nome do Professor" name="profname" />
                    <input type="text" placeholder="Materia" name="materia" />
                    <div class="add-novo add-prof"></div>

                </div>
                <div class="form-input form-input-aluno">
                    <p class="title-info">Aluno</p><br><br>
                    <input type="text" placeholder="Nome do Aluno" name="aluname" />
                    <input type="text" placeholder="Sobrenome" name="alusob" />
                    <div class="add-novo add-aluno"></div>

                </div>
                <div class="form-input">
                    <button type="submit" id="btn-submit">Salvar</button>
                    
                </div>
            </form>
        </div>
        <div class="btn-novo" title="Criar nova turma"></div>
        <div class="show-turmas">
            <main id="center-60">


                <div class="turma">
                    <h1 class="turma-title">Turma</h1>
                    <a href="?id=1"  id="trash"><div class="trash controller"></div></a>
                    <a href="?id=1"  id="edit"><div class="edit controller"></div></a>
                </div>
                
                <div class="turma">
                    <h1 class="turma-title">Turma-2</h1>
                    <a href="?id=2" id="trash"><div class="trash controller"></div></a>
                    <a href="?id=2" id="edit"><div class="edit controller"></div></a>
                </div>
            </main>
        </div>
        <script>
            for(var i=0;i<50;i++) {
                document.write("<br>|");
            }
        </script>
    </section>
    <script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
    <script src="./js/jquery.validate.min.js"></script>
    <script src="./js/localization/messages_pt_BR.min.js"></script>
    <script src="./js/validations.js"></script>
    <script src="./js/main.js"></script>
</body>
</html>