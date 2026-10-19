package io.intercom.android.sdk.helpcenter.sections;

import B1.a;
import Ya.b;
import Ya.k;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import p037cb.u0;

/* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
/* JADX INFO: loaded from: classes3.dex */
@k
public final class Author {
    public static final int $stable = 0;
    public static final Companion Companion = new Companion(null);
    private final Avatar avatar;
    private final String id;
    private final String name;

    /* JADX INFO: compiled from: HelpCenterCollectionContent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final b<Author> serializer() {
            return Author$$serializer.INSTANCE;
        }

        public /* synthetic */ Companion(e eVar) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(int i10, String str, String str2, Avatar avatar, u0 u0Var) {
        String str3 = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        if (1 != (i10 & 1)) {
            p241t7.b.w(i10, 1, Author$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.id = str;
        if ((i10 & 2) == 0) {
            this.name = "";
        } else {
            this.name = str2;
        }
        if ((i10 & 4) != 0) {
            this.avatar = avatar;
        } else {
            this.avatar = new Avatar(str3, (String) (objArr2 == true ? 1 : 0), 3, (e) (objArr == true ? 1 : 0));
        }
    }

    public static /* synthetic */ Author copy$default(Author author, String str, String str2, Avatar avatar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = author.id;
        }
        if ((i10 & 2) != 0) {
            str2 = author.name;
        }
        if ((i10 & 4) != 0) {
            avatar = author.avatar;
        }
        return author.copy(str, str2, avatar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final /* synthetic */ void write$Self$intercom_sdk_base_release(Author author, p024bb.b bVar, p011ab.e eVar) {
        bVar.p(eVar, 0, author.id);
        if (bVar.v(eVar) || !i.a(author.name, "")) {
            bVar.p(eVar, 1, author.name);
        }
        if (!bVar.v(eVar)) {
            if (i.a(author.avatar, new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (e) (0 == true ? 1 : 0)))) {
                return;
            }
        }
        bVar.s(eVar, 2, Avatar$$serializer.INSTANCE, author.avatar);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Avatar component3() {
        return this.avatar;
    }

    public final Author copy(String id, String name, Avatar avatar) {
        i.e(id, "id");
        i.e(name, "name");
        i.e(avatar, "avatar");
        return new Author(id, name, avatar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Author)) {
            return false;
        }
        Author author = (Author) obj;
        return i.a(this.id, author.id) && i.a(this.name, author.name) && i.a(this.avatar, author.avatar);
    }

    public final Avatar getAvatar() {
        return this.avatar;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        return this.avatar.hashCode() + a.b(this.name, this.id.hashCode() * 31, 31);
    }

    public String toString() {
        return "Author(id=" + this.id + ", name=" + this.name + ", avatar=" + this.avatar + ')';
    }

    public Author(String id, String name, Avatar avatar) {
        i.e(id, "id");
        i.e(name, "name");
        i.e(avatar, "avatar");
        this.id = id;
        this.name = name;
        this.avatar = avatar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ Author(String str, String str2, Avatar avatar, int i10, e eVar) {
        this(str, (i10 & 2) != 0 ? "" : str2, (i10 & 4) != 0 ? new Avatar((String) null, (String) (0 == true ? 1 : 0), 3, (e) (0 == true ? 1 : 0)) : avatar);
    }

    public static /* synthetic */ void getAvatar$annotations() {
    }

    public static /* synthetic */ void getId$annotations() {
    }

    public static /* synthetic */ void getName$annotations() {
    }
}
