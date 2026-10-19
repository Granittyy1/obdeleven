package U4;

import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Boolean f6363a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f6364b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AbstractC0794b f6365c;

    public O(AbstractC0794b abstractC0794b) {
        Boolean bool = Boolean.TRUE;
        Objects.requireNonNull(abstractC0794b);
        this.f6365c = abstractC0794b;
        this.f6363a = bool;
        this.f6364b = false;
    }

    public abstract void a(Boolean bool);
}
