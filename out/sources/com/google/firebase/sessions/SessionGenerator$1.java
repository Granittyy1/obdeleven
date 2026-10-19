package com.google.firebase.sessions;

import java.util.UUID;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: SessionGenerator.kt */
/* JADX INFO: loaded from: classes3.dex */
final /* synthetic */ class SessionGenerator$1 extends FunctionReferenceImpl implements Ia.a<UUID> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SessionGenerator$1 f28657b = new SessionGenerator$1();

    public SessionGenerator$1() {
        super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
    }

    @Override // Ia.a
    public final UUID invoke() {
        return UUID.randomUUID();
    }
}
