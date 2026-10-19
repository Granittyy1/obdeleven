package androidx.lifecycle;

import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: Lifecycle.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class Lifecycle {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p005a4.t f17747a = new p005a4.t();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Lifecycle.kt */
    public static final class Event {
        private static final /* synthetic */ Ba.a $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;
        public static final a Companion;
        public static final Event ON_ANY;
        public static final Event ON_CREATE;
        public static final Event ON_DESTROY;
        public static final Event ON_PAUSE;
        public static final Event ON_RESUME;
        public static final Event ON_START;
        public static final Event ON_STOP;

        /* JADX INFO: compiled from: Lifecycle.kt */
        public static final class a {
            public static Event a(State state) {
                kotlin.jvm.internal.i.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return Event.ON_DESTROY;
                }
                if (iOrdinal == 3) {
                    return Event.ON_STOP;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return Event.ON_PAUSE;
            }

            public static Event b(State state) {
                kotlin.jvm.internal.i.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 1) {
                    return Event.ON_CREATE;
                }
                if (iOrdinal == 2) {
                    return Event.ON_START;
                }
                if (iOrdinal != 3) {
                    return null;
                }
                return Event.ON_RESUME;
            }

            public static Event c(State state) {
                kotlin.jvm.internal.i.e(state, "state");
                int iOrdinal = state.ordinal();
                if (iOrdinal == 2) {
                    return Event.ON_CREATE;
                }
                if (iOrdinal == 3) {
                    return Event.ON_START;
                }
                if (iOrdinal != 4) {
                    return null;
                }
                return Event.ON_RESUME;
            }
        }

        /* JADX INFO: compiled from: Lifecycle.kt */
        public /* synthetic */ class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17748a;

            static {
                int[] iArr = new int[Event.values().length];
                try {
                    iArr[Event.ON_CREATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Event.ON_STOP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Event.ON_START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Event.ON_PAUSE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Event.ON_RESUME.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Event.ON_DESTROY.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Event.ON_ANY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                f17748a = iArr;
            }
        }

        static {
            Event event = new Event("ON_CREATE", 0);
            ON_CREATE = event;
            Event event2 = new Event("ON_START", 1);
            ON_START = event2;
            Event event3 = new Event("ON_RESUME", 2);
            ON_RESUME = event3;
            Event event4 = new Event("ON_PAUSE", 3);
            ON_PAUSE = event4;
            Event event5 = new Event("ON_STOP", 4);
            ON_STOP = event5;
            Event event6 = new Event("ON_DESTROY", 5);
            ON_DESTROY = event6;
            Event event7 = new Event("ON_ANY", 6);
            ON_ANY = event7;
            Event[] eventArr = {event, event2, event3, event4, event5, event6, event7};
            $VALUES = eventArr;
            $ENTRIES = kotlin.enums.a.a(eventArr);
            Companion = new a();
        }

        public Event() {
            throw null;
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }

        public final State a() {
            switch (b.f17748a[ordinal()]) {
                case 1:
                case 2:
                    return State.f17751d;
                case 3:
                case 4:
                    return State.f17752e;
                case 5:
                    return State.f17753f;
                case 6:
                    return State.f17749b;
                case 7:
                    throw new IllegalArgumentException(this + " has no target state");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: Lifecycle.kt */
    public static final class State {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final State f17749b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final State f17750c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final State f17751d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final State f17752e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final State f17753f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ State[] f17754g;

        static {
            State state = new State("DESTROYED", 0);
            f17749b = state;
            State state2 = new State("INITIALIZED", 1);
            f17750c = state2;
            State state3 = new State("CREATED", 2);
            f17751d = state3;
            State state4 = new State("STARTED", 3);
            f17752e = state4;
            State state5 = new State("RESUMED", 4);
            f17753f = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            f17754g = stateArr;
            kotlin.enums.a.a(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) f17754g.clone();
        }

        public final boolean a(State state) {
            return compareTo(state) >= 0;
        }
    }

    public abstract void a(InterfaceC1375s interfaceC1375s);

    public abstract State b();

    public abstract void c(InterfaceC1375s interfaceC1375s);
}
