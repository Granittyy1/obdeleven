package kotlinx.coroutines.flow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: SharingStarted.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class SharingCommand {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SharingCommand f43354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SharingCommand f43355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final SharingCommand f43356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ SharingCommand[] f43357e;

    static {
        SharingCommand sharingCommand = new SharingCommand("START", 0);
        f43354b = sharingCommand;
        SharingCommand sharingCommand2 = new SharingCommand("STOP", 1);
        f43355c = sharingCommand2;
        SharingCommand sharingCommand3 = new SharingCommand("STOP_AND_RESET_REPLAY_CACHE", 2);
        f43356d = sharingCommand3;
        SharingCommand[] sharingCommandArr = {sharingCommand, sharingCommand2, sharingCommand3};
        f43357e = sharingCommandArr;
        kotlin.enums.a.a(sharingCommandArr);
    }

    public SharingCommand() {
        throw null;
    }

    public static SharingCommand valueOf(String str) {
        return (SharingCommand) Enum.valueOf(SharingCommand.class, str);
    }

    public static SharingCommand[] values() {
        return (SharingCommand[]) f43357e.clone();
    }
}
