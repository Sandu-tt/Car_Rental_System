package embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Embeddable;

/**
 * @author : SANDU
 * @project Car_Rental_System
 */

@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class Image {
    private String front_View;
    private String back_View;
    private String side_View;
    private String interior;
}
