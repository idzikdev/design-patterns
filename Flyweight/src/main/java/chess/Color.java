package chess;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Color {
    @Getter
    private int r;
    @Getter
    private int g;
    @Getter
    private int b;
}