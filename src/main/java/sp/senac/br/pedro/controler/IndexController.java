package sp.senac.br.pedro.controler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import sp.senac.br.pedro.entity.Usuario;
import sp.senac.br.pedro.repositories.UsuarioRepository;

@Controller
public class IndexController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/")
    public ModelAndView home (){
        ModelAndView mv = new ModelAndView ("/index");

        Usuario usuario = new Usuario("pedro","pedrorogge@hotmailcom","1230","ADIMIN");

        usuarioRepository.save(usuario);

        return mv;
    }
}
