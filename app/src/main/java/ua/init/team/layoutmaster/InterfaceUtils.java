package ua.init.team.layoutmaster;

/**
 * Created by dev on 02.06.17.
 */

public class InterfaceUtils {

    private static InterfaceUtils interfaceUtils;
    private OnButtonClick onButtonClick;

    private InterfaceUtils(){

    }

    public static InterfaceUtils getInterfaceUtils(){

        if (interfaceUtils == null)
            interfaceUtils = new InterfaceUtils();
        return interfaceUtils;
    }


    public OnButtonClick getOnButtonClick() {
        return onButtonClick;
    }

    public void setOnButtonClick(OnButtonClick onButtonClick) {
        this.onButtonClick = onButtonClick;
    }
}
