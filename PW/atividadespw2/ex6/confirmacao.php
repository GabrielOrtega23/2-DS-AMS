<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="confirmacao.css">
    <title>exercicio1</title>
</head>
<body>
            <?php
                $salario = $_POST["num1"];

               $gratificacao = $salario * 0.10;

               $salariocombonus = $salario + $gratificacao;

               $imposto = $salariocombonus * 0.20;

               $salarioLiquido = $salariocombonus - $imposto;
            ?>

    <div class = "bloco">
      <div class="lista">
        <?php
      echo "Salário líquido: R$ " . $salarioLiquido;
           ?>
     <button><a href="index.html"><strong>Retornar</strong></a></button>
     </div> 
    </div>

    


</body>
</html>