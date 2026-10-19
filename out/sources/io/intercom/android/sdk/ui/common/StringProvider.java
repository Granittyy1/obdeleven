package io.intercom.android.sdk.ui.common;

import B7.b;
import Q8.d;
import android.content.Context;
import androidx.compose.runtime.InterfaceC1084f;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;

/* JADX INFO: compiled from: ActualStringOrRes.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class StringProvider {
    public static final int $stable = 0;

    /* JADX INFO: compiled from: ActualStringOrRes.kt */
    public static final class ActualString extends StringProvider {
        public static final int $stable = 0;
        private final String string;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActualString(String string) {
            super(null);
            i.e(string, "string");
            this.string = string;
        }

        public static /* synthetic */ ActualString copy$default(ActualString actualString, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = actualString.string;
            }
            return actualString.copy(str);
        }

        public final String component1() {
            return this.string;
        }

        public final ActualString copy(String string) {
            i.e(string, "string");
            return new ActualString(string);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof ActualString) && i.a(this.string, ((ActualString) obj).string);
        }

        public final String getString() {
            return this.string;
        }

        public int hashCode() {
            return this.string.hashCode();
        }

        public String toString() {
            return b.g(new StringBuilder("ActualString(string="), this.string, ')');
        }
    }

    public /* synthetic */ StringProvider(e eVar) {
        this();
    }

    public final String getText(InterfaceC1084f interfaceC1084f, int i10) {
        String string;
        interfaceC1084f.L(-1160503525);
        if (this instanceof ActualString) {
            string = ((ActualString) this).getString();
        } else {
            if (!(this instanceof StringRes)) {
                throw new NoWhenBranchMatchedException();
            }
            StringRes stringRes = (StringRes) this;
            string = ActualStringOrResKt.parseString((Context) interfaceC1084f.x(AndroidCompositionLocals_androidKt.f14793b), stringRes.getStringRes(), stringRes.getParams());
        }
        interfaceC1084f.D();
        return string;
    }

    private StringProvider() {
    }

    /* JADX INFO: compiled from: ActualStringOrRes.kt */
    public static final class StringRes extends StringProvider {
        public static final int $stable = 8;
        private final List<Pair<String, String>> params;
        private final int stringRes;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringRes(int i10, List<Pair<String, String>> params) {
            super(null);
            i.e(params, "params");
            this.stringRes = i10;
            this.params = params;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ StringRes copy$default(StringRes stringRes, int i10, List list, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                i10 = stringRes.stringRes;
            }
            if ((i11 & 2) != 0) {
                list = stringRes.params;
            }
            return stringRes.copy(i10, list);
        }

        public final int component1() {
            return this.stringRes;
        }

        public final List<Pair<String, String>> component2() {
            return this.params;
        }

        public final StringRes copy(int i10, List<Pair<String, String>> params) {
            i.e(params, "params");
            return new StringRes(i10, params);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StringRes)) {
                return false;
            }
            StringRes stringRes = (StringRes) obj;
            return this.stringRes == stringRes.stringRes && i.a(this.params, stringRes.params);
        }

        public final List<Pair<String, String>> getParams() {
            return this.params;
        }

        public final int getStringRes() {
            return this.stringRes;
        }

        public int hashCode() {
            return this.params.hashCode() + (Integer.hashCode(this.stringRes) * 31);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("StringRes(stringRes=");
            sb2.append(this.stringRes);
            sb2.append(", params=");
            return d.b(sb2, this.params, ')');
        }

        public StringRes(int i10, List list, int i11, e eVar) {
            this(i10, (i11 & 2) != 0 ? EmptyList.f42983b : list);
        }
    }
}
