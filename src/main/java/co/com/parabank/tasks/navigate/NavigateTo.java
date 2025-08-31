package co.com.parabank.tasks.navigate;

import co.com.parabank.utils.KeyToRemember;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Task {
    private final String url;

    public NavigateTo(String keyCalledByActor) {
        this.url = keyCalledByActor;
    }

    public static NavigateTo parabank() {
        return new NavigateTo(KeyToRemember.PARABANK_URL.name());
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Open.url(actor.recall(url)).performAs(actor);
    }
}
