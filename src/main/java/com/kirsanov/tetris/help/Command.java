package com.kirsanov.tetris.help;

import org.springframework.util.StringUtils;

import java.util.ArrayList;
import java.util.List;

public class Command {

    private int left = -1;
    private int right = -1;
    private int rotate = -1;

    public Command left(int left) {
        this.left = left;
        return this;
    }

    public Command right(int right) {
        this.right = right;
        return this;
    }

    public Command rotate(int rotate) {
        this.rotate = rotate;
        return this;
    }

    public String build() {
        List<String> commands = new ArrayList<String>();
        if (rotate > 0) {
            commands.add("rotate=" + rotate);
        }
        if (left > 0) {
            commands.add("left=" + left);
        }
        if (right > 0) {
            commands.add("right=" + right);
        }
        commands.add("drop");

        return StringUtils.collectionToDelimitedString(commands, ", ");
    }
}
