package okio.internal;

import Ia.l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.i;
import p318zb.z;

/* JADX INFO: compiled from: ResourceFileSystem.kt */
/* JADX INFO: loaded from: classes2.dex */
final class ResourceFileSystem$toJarRoot$zip$1 extends Lambda implements l<g, Boolean> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final ResourceFileSystem$toJarRoot$zip$1 f45711h = new ResourceFileSystem$toJarRoot$zip$1();

    public ResourceFileSystem$toJarRoot$zip$1() {
        super(1);
    }

    @Override // Ia.l
    public final Boolean invoke(g gVar) {
        g entry = gVar;
        i.e(entry, "entry");
        z zVar = f.f45724e;
        return Boolean.valueOf(f.a.a(entry.f45728a));
    }
}
