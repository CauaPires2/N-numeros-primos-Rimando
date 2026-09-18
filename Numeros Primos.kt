fun main() {
    print("Digite N: ") // Digita aí, não vai doer, confia 😎
    val n = readLine()!!.toInt()

    var num = 2 // Começa no 2, porque o 1 não é o X da questão
    var cont = 0 // Contando os primos, sem perder a Poesia, mas n deveria ser sobre rima?

    while (cont < n) { // Enquanto não chegar no N, continua o rolê
        var primo = true // Por enquanto mantém na medida, pq o primo deixa tudo lá encima

        for (i in 2 until num) { // Testando e divindindo 1 ou 1
            if (num % i == 0) { // Dividiu? Logo aqui? Então tira logo esse numero daqui
                primo = false
                break // Se achou um dividsor ta ai a questão, ja pode apertar e parar com o botão
            }
        }

        if (primo) { // Se passou no teste, pode comemorar
            print("$num ") // Então printa logo pra n enrolar
            cont++ // Mais um pra conta então vamo lá
        }

        num++ // Próximo número, porque a vida não pode parar
    }
}