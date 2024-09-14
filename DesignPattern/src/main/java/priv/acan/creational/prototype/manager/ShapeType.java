package priv.acan.creational.prototype.manager;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author acan
 * @since 2024/09/12 15:34
 */
@Getter
@AllArgsConstructor
public enum ShapeType {

    CIRCLE(1, "circle"),
    SQUARE(2, "square"),
    RECTANGLE(3, "rectangle");

    private final int id;
    private final String type;
}
