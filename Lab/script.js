// Comando para baixar os pacotes da lib
// npm install heatmap.js

// Precisa executar esse comando para testar
// python3 -m http.server


var config = {
    container: document.getElementById('heatmapContainer'),
    radius: 10,
    maxOpacity: .5,
    minOpacity: 0,
    blur: .75
  };
  // create heatmap with configuration
  var heatmapInstance = h337.create(config);