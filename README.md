# Gestão de Obras Silveira — projeto Android

Este pacote é um projeto Android nativo simples (Java + WebView) com interface local e armazenamento no aparelho. Inclui cadastro de clientes, obras, status, fotos, pagamentos e resumo financeiro.

## Gerar APK usando somente o celular
1. Entre em github.com pelo navegador Android e crie uma conta ou faça login.
2. Crie um repositório vazio chamado `gestao-obras-silveira`.
3. Extraia este ZIP no celular e envie todos os arquivos e pastas ao repositório, incluindo `.github/workflows/build-apk.yml`.
4. Abra a aba Actions do repositório. Selecione `Construir APK Android` e toque em `Run workflow`.
5. Quando terminar, abra a execução e baixe o Artifact `Gestao-de-Obras-Silveira-APK`.
6. Extraia o arquivo e instale `app-debug.apk`. Autorize instalação pelo navegador/gerenciador de arquivos quando o Android solicitar.

## Limitações desta primeira versão
- É um APK Android de teste, não publicado na Play Store.
- Dados e fotos ficam localmente no aparelho; desinstalar ou limpar os dados pode apagá-los.
- Login real, banco na nuvem, sincronização entre aparelhos, PDF e WhatsApp ainda precisam ser integrados e testados antes de uso comercial.
- Não inclua senhas ou chaves privadas em repositórios públicos.
