package io.ktor.util.pipeline;

import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: PipelinePhaseRelation.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: compiled from: PipelinePhaseRelation.kt */
    public static final class a extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P3.b f40563a;

        public a(P3.b relativeTo) {
            i.e(relativeTo, "relativeTo");
            this.f40563a = relativeTo;
        }
    }

    /* JADX INFO: compiled from: PipelinePhaseRelation.kt */
    public static final class b extends e {
    }

    /* JADX INFO: compiled from: PipelinePhaseRelation.kt */
    public static final class c extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f40564a = new c();
    }
}
