//PEGA O PARAMETRO "id" DA URL
const url = new URL(location.href);
const id = url.searchParams.get("id");


//ABRE FORMULARIO
$(".btn-novo").click(() => {
    $("html").css({ overflow: "hidden" });
    $(".div-form").css({ width: "100%" });
    $(".form-register").css({ display: 'block' });
    $(".title-form").css({ display: 'block' });
    $(".btn-novo").css({ display: 'none' });
});


//FECHA FORMULARIO
$(".close-form").click(() => {
    $("html").css({ overflow: "auto" });
    $(".div-form").css({ width: 0 });
    $(".form-register").css({ display: 'none' });
    $(".title-form").css({ display: 'none' });
    $(".btn-novo").css({ display: 'block' });
    
});

//ADD NOVO INPUT PARA PROFESSOR
var maxProf = 1;
$(".add-prof").click(() => {
    if(maxProf >= 5) {
        return;
    }
    
    const divInput = $("<div />").attr({ class: "add-input"})

    const remove = $("<button />").attr({ type: "button",  class: "remove-tag"  })

    const inputName = $("<input />").attr({ placeholder: "Nome do Professor", id: `input-${maxProf}`});
    const inputMateria = $("<input />").attr({ placeholder: "Materia", id: `input-${maxProf}`});


    if(maxProf == 4) {
        $(".add-prof").css({ display: "none" });
    }

    remove.click(() => {
        divInput.remove();
        maxProf--;
        $(".add-prof").css({ display: "block" });

    });

    divInput.append([inputName, inputMateria, remove]);
    $(".form-input-prof").append(divInput);

    maxProf++;
});


$("#edit").click(e => {
    e.preventDefault();
    console.log($("#edit").prop("href"));
});

//ADD NOVO INPUT PARA ALUNO
var maxAluno = 1;
$(".add-aluno").click(() => {
    if(maxAluno >= 5) {
        return;
    }

    const divInput = $("<div />").attr({ class: "add-input" })

    const remove = $("<button />").attr({ type: "button", class: "remove-tag" })

    const inputName = $("<input />").attr({ placeholder: "Nome do Aluno", id: `input-${maxAluno}`});
    const inputMateria = $("<input />").attr({ placeholder: "Sobrenome", id: `input-${maxAluno}`});

    if(maxAluno == 4) {
        $(".add-aluno").css({ display: "none" });
    }

    remove.click(() => {
        divInput.remove();
        maxAluno--;
        $(".add-aluno").css({ display: "block" });
    });

    divInput.append([inputName, inputMateria, remove]);
    $(".form-input-aluno").append(divInput);

    maxAluno++;

});