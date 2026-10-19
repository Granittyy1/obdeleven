package androidx.paging;

/* JADX INFO: compiled from: RemoteMediator.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class RemoteMediator<Key, Value> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: RemoteMediator.kt */
    public static final class InitializeAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final InitializeAction f19322b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ InitializeAction[] f19323c;

        static {
            InitializeAction initializeAction = new InitializeAction("LAUNCH_INITIAL_REFRESH", 0);
            f19322b = initializeAction;
            f19323c = new InitializeAction[]{initializeAction, new InitializeAction("SKIP_INITIAL_REFRESH", 1)};
        }

        public InitializeAction() {
            throw null;
        }

        public static InitializeAction valueOf(String str) {
            return (InitializeAction) Enum.valueOf(InitializeAction.class, str);
        }

        public static InitializeAction[] values() {
            return (InitializeAction[]) f19323c.clone();
        }
    }
}
