package Entity;
import java.util.HashSet;
import java.util.Set;
 
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.swing.text.html.HTML.Tag;

import org.springframework.core.metrics.StartupStep.Tags;

import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name = "POSTS")
public class Post {   // table name will be posts
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title, description;
    @JsonManagedReference
    @ManyToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinTable(
            name = "tags_posts",    // intermediate physical table name
            joinColumns = {
                    @JoinColumn(name = "posts_id")  // column to connect with posts
                    },
            inverseJoinColumns = {
                    @JoinColumn(name="tags_id")   // column to connect with tags
                    }
            )
    private Set<Tag> tags=new HashSet<>();
	public void setTitle(String string) {
		// TODO Auto-generated method stub
		
	}
}