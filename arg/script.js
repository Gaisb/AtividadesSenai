const frequencyDial = document.getElementById('frequency');
const status = document.getElementById('radio-status');
const dossier = document.getElementById('dossier');
const docTitle = document.getElementById('doc-title');
const docContent = document.getElementById('doc-content');

const SECRETS = {
    54: {
        title: "AGOSTO, 1954: O TIRO",
        content: "Um disparo ecoa no escuro. Getúlio Vargas deixa a vida para entrar na história. O Brasil ferve nas ruas. O inimigo não era quem você pensava."
    },
    20: {
        title: "A ERA DE OURO?",
        content: "As rádios tocam Bossa Nova, mas o rastro de censura começa a aparecer. A modernidade de Brasília está sendo desenhada em segredo."
    },
    95: {
    title: "cansei de fzr",
    content: "segredo q nada."
    }
};

frequencyDial.addEventListener('input', (e) => {
    const val = e.target.value;
    
    // Simulação de interferência (usabilidade)
    if (val == 54 || val == 20 || val == 95  ) {
        status.innerText = "SINAL ENCONTRADO!";
        status.style.color = "#00ff00";
        unlockDossier(val);
    } else {
        status.innerText = "ESTÁTICA... " + val + "Hz";
        status.style.color = "#ff0000";
        lockDossier();
    }
});

function unlockDossier(freq) {
    dossier.classList.remove('locked');
    docTitle.innerText = SECRETS[freq].title;
    docContent.innerText = SECRETS[freq].content;
}

function lockDossier() {
    dossier.classList.add('locked');
    docTitle.innerText = "???";
    docContent.innerText = "Sintonize uma frequência válida para liberar as informações retidas.";
}