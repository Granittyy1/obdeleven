package p083g7;

import Q3.k;
import com.google.firebase.inappmessaging.model.MessageType;
import java.util.Map;

/* JADX INFO: compiled from: InAppMessage.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessageType f35627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f35628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<String, String> f35629c;

    public h(k kVar, MessageType messageType, Map<String, String> map) {
        this.f35628b = kVar;
        this.f35627a = messageType;
        this.f35629c = map;
    }

    @Deprecated
    public f a() {
        return null;
    }
}
