
console.log("carregado teste")
const campoFormulario = document.getElementById("formulario");

    if(campoFormulario instanceof HTMLFormElement){
        campoFormulario.addEventListener("submit", async function(event){
            event.preventDefault();

            //novo
            let nomeDigitado ="";
            let senhaDigitada ="";
            let idadeConvertida = 0;

        const campoNome = document.getElementById("nome");

            if(campoNome instanceof HTMLInputElement){
                nomeDigitado = campoNome.value;

                if(nomeDigitado.trim() === ""){
                    console.log("O campo Nome nao pode estar vazio")
                }else{
                    console.log(nomeDigitado)
                }
            }

        const campoSenha = document.getElementById("senha");

            if(campoSenha instanceof HTMLInputElement){
                senhaDigitada = campoSenha.value;

                if(senhaDigitada.trim() === ""){
                    console.log("O campo Senha nao pode estar vazio")
                }else{
                    console.log(senhaDigitada)
                }
            }

        const campoIdade = document.getElementById("idade");

            if(campoIdade instanceof HTMLInputElement){

                const idadeDigitada = campoIdade.value;

                if(idadeDigitada === ""){
                    console.log("Campo Idade nao pode estar vazio")
                }else{

                    idadeConvertida = Number(campoIdade.value);
                        
                        if (idadeConvertida < 0 || idadeConvertida > 130) {
                            console.log("Idade inválida");
                        } else {
                            console.log("Idade válida");
                        }
                } 

            }

        const resposta = await fetch("http://localhost:8080/usuario",{
            method: "POST",
            headers: {
                "Content-Type": "application/json"
            },
            body: JSON.stringify({
                nome: nomeDigitado,
                senha: senhaDigitada,
                idade: idadeConvertida
            })
        })

            console.log("Status da resposta: ", resposta.status)

            console.log("Formulario enviado!")
        });
    }