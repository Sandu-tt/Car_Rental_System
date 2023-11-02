package embeded;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.Embeddable;

/**
 * @author : SANDU
 * @created 02/11/2023
 * @project Car_Rental_System
 */


@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ImageDTO {
    private MultipartFile front_View;
    private MultipartFile back_View;
    private MultipartFile side_View;
    private MultipartFile interior;
}
