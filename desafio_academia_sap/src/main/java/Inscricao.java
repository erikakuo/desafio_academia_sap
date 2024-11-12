import java.util.Date;

import com.accenture.desafio.entity.Aluno;
import com.accenture.desafio.entity.Curso;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;
@Entity
@Data
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "alunoId")
    private Aluno aluno;

    @ManyToOne
    @JoinColumn(name = "cursoId")
    private Curso curso;

    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInscricao = new Date();
}