### Projeto desenvolvido em Spring Boot
- O projeto foi desenvolvido através do curso https://www.udemy.com/course/java-curso-completo/ 
- Se trata de uma api para a manipulação de produtos, usuários e vendas.

### Como usar:
Basta fazer download e executar no Spring Tool Suite e acessar as rotas através do localhost que provavelmente será o 8080.
No modo de teste, o banco será criado na próprio localhost e as informações serão cadastradas automaticamente.

Exemplo das chamadas:
- Busca de todos os usuários: <span style="color:green">**GET**</span> localhost:8080/users
- Buscar um usuário especifico: <span style="color:green">**GET**</span> localhost:8080/users/1
- Busca dos pedidos: <span style="color:green">**GET**</span> localhost:8080/orders
- Buscar um pedido especifico: <span style="color:green">**GET**</span> localhost:8080/orders/1
- Busca de todos os produtos: <span style="color:green">**GET**</span>localhost:8080/products
- Buscar um produto específico: <span style="color:green">**GET**</span> localhost:8080/products/1
- Cadastro de usuário: <span style="color:blue">**POST**</span> localhost:8080/users
  - corpo: 
  {
	 "name": "Rodrigo",
	 "email": "rodrigo@gmail.com",
	 "phone": "999999999",
	 "password": "123456"
} 
- Atualização de usuário: <span style="color:#D7DF01">**PUT**</span>  localhost:8080/users/1(id)
  - corpo: 
  {
	 "name": "Rodrigo",
	 "email": "rodrigo@gmail.com",
	 "phone": "999999999"
} 
- Deleção de usuário: <span style="color:red">**DELETE**</span> localhost:8080/users/1

  
# Modelo de domínio

![](https://user-images.githubusercontent.com/51686847/84574572-ac36a100-ad7d-11ea-9da2-c9f52cae5e44.png)

