function total() {
    const carne_homem = 500; const carne_mulher = 300; const carne_crianca = 200;
    const frango_homem = 200; const frango_mulher = 200; const frango_crianca = 100;
    const linguica_homem = 200; const linguica_mulher = 200; const linguica_crianca = 200;
    const refrigerante_homem = 300; const refrigerante_mulher = 400; const refrigerante_crianca = 200;
    const cerveja_homem = 800; const cerveja_mulher = 500; const cerveja_crianca = 0;

    let homens = document.getElementById("men").value;
    let mulheres = document.getElementById("woman").value;
    let criancas = document.getElementById("kid").value;

    let tcarne = (homens * carne_homem) + (mulheres * carne_mulher) + (criancas * carne_crianca);
    let tfrango = (homens * frango_homem) + (mulheres * frango_mulher) + (criancas * frango_crianca);
    let tlinguica = (homens * linguica_homem) + (mulheres * linguica_mulher) + (criancas * linguica_crianca);
    let trefrigerante = (homens * refrigerante_homem) + (mulheres * refrigerante_mulher) + (criancas * refrigerante_crianca);
    let tcerveja = (homens * cerveja_homem) + (mulheres * cerveja_mulher) + (criancas * cerveja_crianca);

    if (tcarne >= 1000) {
        tcarne = tcarne / 1000;
        document.getElementById("TCarne").innerHTML = tcarne + "Kg de Carne Bovina";
    } else {
        document.getElementById("TCarne").innerHTML = tcarne + "g de Carne Bovina";
    };
    if (tfrango >= 1000) {
        tfrango = tfrango / 1000;
        document.getElementById("TFrango").innerHTML = tfrango + "Kg de Frango";
    } else {
        document.getElementById("TFrango").innerHTML = tfrango + "g de Frango";
    };
    if (tlinguica >= 1000) {
        tlinguica = tlinguica / 1000;
        document.getElementById("TLinguica").innerHTML = tfrango + "Kg de Linguiça";
    } else {
        document.getElementById("TLinguica").innerHTML = tfrango + "g de Linguiça";
    };
    if (trefrigerante >= 1000) {
        trefrigerante = trefrigerante / 1000;
        document.getElementById("TRefrigerante").innerHTML = trefrigerante + "L de Refrigerante";
    } else {
        document.getElementById("TRefrigerante").innerHTML = trefrigerante + "ml de Refrigerante";
    };
    if (tcerveja >= 1000) {
        tcerveja = tcerveja / 1000;
        document.getElementById("TCerveja").innerHTML = tcerveja + "L de Cerveja";
    } else {
        document.getElementById("TCerveja").innerHTML = tcerveja + "ml de Cerveja";

    };

}
