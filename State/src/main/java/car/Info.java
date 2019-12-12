package car;

public enum Info {
    HAVE_TO_LOCK("You have to lock the car beforehand."),
    HAVE_TO_UNLOCK("You have to unlock the car beforehand."),
    HAVE_TO_START_ENGINE("You have to start engine beforehand."),
    HAVE_TO_STOP_ENGINE("You have to stop engine beforehand."),
    HAVE_TO_START_DRIVING("You have to start driving beforehand."),
    HAVE_TO_STOP_DRIVING("You have to stop driving beforehand."),

    JUST_LOCKED("You have just locked the car."),
    JUST_UNLOCKED("You have just unlocked the car."),
    JUST_STARTED_ENGINE("You have just started engine."),
    JUST_STOPPED_ENGINE("You have just stopped engine."),
    JUST_START_DRIVING("You have just start driving."),
    JUST_STOP_DRIVING("You have just stopped driving."),

    ALREADY_LOCKED("The car is already locked."),
    ALREADY_UNLOCKED("The car is already unlocked."),
    ALREADY_STARTED_ENGINE("The engine is already started."),
    ALREADY_STOPPED_ENGINE("The engine is already stopped."),
    ALREADY_START_DRIVING("The car is already moving."),
    ALREADY_STOPPED_DRIVING("The car is already stopped.");

    private String description;

    Info(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}