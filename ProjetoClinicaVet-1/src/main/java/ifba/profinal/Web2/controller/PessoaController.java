//package ifba.profinal.Web2.controller;
//import ifba.profinal.Web2.model.Endereco;
//import java.util.List;
//import java.util.Optional;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import ifba.profinal.Web2.model.Pessoa;
//import ifba.profinal.Web2.repository.EnderecoRepository;
//import ifba.profinal.Web2.service.PessoaService;
//
//@RestController
//@RequestMapping("Pessoa")
////@CrossOrigin(origins = "http://127.0.0.1:5500")
//public class PessoaController {
//	@Autowired
//  private PessoaService service;
//	@Autowired
//  private EnderecoRepository enderecoRepository;
//	
//	
//  @PostMapping
//    public ResponseEntity<?> add(@RequestBody Pessoa pessoa) {
//        // Salvar endereço primeiro
//       Endereco endereco = pessoa.getEndereco();
//        enderecoRepository.save(endereco);
//
//        // Definir o endereço salvo na pessoa
//        pessoa.setEndereco(endereco);
//
//        // Agora salvar a pessoa
//        Pessoa savedPessoa = service.inserir(pessoa);
//        return ResponseEntity.ok(savedPessoa);
//  }
// 
//  @PutMapping
//	public Pessoa atualizar(@RequestBody  Pessoa pessoa) {
//		return service.atualizar(pessoa);
//	}
//  @DeleteMapping
//	public void delete(@PathVariable int id ) {
//		service.deletePorId(id);
//	}
//	@GetMapping
//	public List<Pessoa>listar(){
//		return service.list();
//	}
//	@GetMapping("/{id}")
//	public Optional<Pessoa>localizarPorId(@PathVariable int id){
//		return service.localizarPorId(id);
//	}
//}