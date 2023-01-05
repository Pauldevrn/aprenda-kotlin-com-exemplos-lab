// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, MEDIO, AVANCADO }

// Classe que representa um usuário
class Usuario

// Classe que representa um conteúdo educacional oferecido em uma formação
data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

// Classe que representa uma formação oferecida pela DIO
data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {
    // Lista para armazenar os usuários matriculados na formação
    val inscritos = mutableListOf<Usuario>()
    
    // Método para matricular usuário na formação
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    //formações com diferentes níveis
    val formacaoBasico = Formacao("Formação Kotlin Básico", Nivel.BASICO, listOf(ConteudoEducacional("Introdução ao Kotlin")))
    val formacaoMedio = Formacao("Formação Kotlin Médio", Nivel.MEDIO, listOf(ConteudoEducacional("Orientação a Objetos com Kotlin")))
    val formacaoAvancado = Formacao("Formação Kotlin Avançado", Nivel.AVANCADO, listOf(ConteudoEducacional("Desenvolvimento de Aplicações Android com Kotlin")))

    // usuários criados
    val usuario1 = Usuario()
    val usuario2 = Usuario()
    val usuario3 = Usuario()

    // Usuários matriculados nas formações
    formacaoBasico.matricular(usuario1)
    formacaoMedio.matricular(usuario2)
    formacaoAvancado.matricular(usuario3)

    // Cria a lista de formações
    val formacoes = listOf(formacaoBasico, formacaoMedio, formacaoAvancado)

    // Exibe a lista de formações e os alunos matriculados em cada uma delas
    formacoes.forEach { formacao ->
        println("Formação: ${formacao.nome} - Nível: ${formacao.nivel}")
        println("Alunos matriculados: ${formacao.inscritos}")
    }
}


