package com.obdeleven.feature.boomboarding.ui;

import com.voltasit.obdeleven.R;
import p005a4.q;

/* JADX INFO: compiled from: BoomboardingUiState.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: compiled from: BoomboardingUiState.kt */
    public static final class a extends c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.raw.diagnostics);
        }

        public final String toString() {
            return "Diagnostics(contentLocation=2131886083)";
        }
    }

    /* JADX INFO: compiled from: BoomboardingUiState.kt */
    public static final class b extends c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.raw.intro_boomboarding);
        }

        public final String toString() {
            return "Intro(contentLocation=2131886090)";
        }
    }

    /* JADX INFO: renamed from: com.obdeleven.feature.boomboarding.ui.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BoomboardingUiState.kt */
    public static final class C0293c extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final BoomboardingVideoType f29237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29238b;

        public C0293c(BoomboardingVideoType boomboardingVideoType, int i10) {
            this.f29237a = boomboardingVideoType;
            this.f29238b = i10;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0293c)) {
                return false;
            }
            C0293c c0293c = (C0293c) obj;
            return this.f29237a == c0293c.f29237a && this.f29238b == c0293c.f29238b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f29238b) + (this.f29237a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Oca(currentVideo=");
            sb2.append(this.f29237a);
            sb2.append(", contentLocation=");
            return q.c(sb2, this.f29238b, ")");
        }
    }

    /* JADX INFO: compiled from: BoomboardingUiState.kt */
    public static final class d extends c {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            ((d) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.raw.intro_boomboarding);
        }

        public final String toString() {
            return "OrderNowStep(contentLocation=2131886090)";
        }
    }
}
