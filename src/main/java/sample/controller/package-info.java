/**
 * UI層のコンポーネントを管理します。
 * <p>アプリケーション層のコンポーネントを利用してユースケース処理を実現します。
 * UI層のコンポーネントが直接ドメイン層を呼び出す事やController同士で相互依存することは想定していません。<br>
 * ※EntityについてはDTOとして解釈することで許容しますが、必要以上の情報を返してセキュリティリスクを生まぬよう注意する必要があります。
 */
package sample.controller;