package kotlinx.datetime.internal.format.parser;

/* JADX INFO: compiled from: NumberConsumer.kt */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e<Receiver> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f43905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f43906b;

    public e(String str, Integer num) {
        this.f43905a = num;
        this.f43906b = str;
    }

    public abstract f a(c cVar, String str);

    public Integer b() {
        return this.f43905a;
    }
}
