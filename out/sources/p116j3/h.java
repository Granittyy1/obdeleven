package p116j3;

import com.airbnb.lottie.model.content.Mask;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: MaskKeyframeAnimation.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f41104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f41105c;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3) {
        this.f41103a = obj;
        this.f41104b = obj2;
        this.f41105c = obj3;
    }

    public h(List list) {
        this.f41105c = list;
        this.f41103a = new ArrayList(list.size());
        this.f41104b = new ArrayList(list.size());
        for (int i10 = 0; i10 < list.size(); i10++) {
            ((ArrayList) this.f41103a).add(new m((List) ((Mask) list.get(i10)).f23383b.f3048c));
            ((ArrayList) this.f41104b).add(((Mask) list.get(i10)).f23384c.a());
        }
    }
}
