package functional.comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FluentComparator {
	public static void main(String[] args) {
		OofaCategory lProp = new OofaCategory("v8_LProp", "Firm Long", "Firm", GicType.SOURCE_GIC);
		OofaCategory sProp = new OofaCategory("v8_SProp", "Firm Short", "Firm", GicType.USE_GIC);
		OofaCategory lCust = new OofaCategory("v8_LCust", "Cust Long", "Cust", GicType.SOURCE_GIC);
		OofaCategory sCust = new OofaCategory("v8_SCust", "Cust Short", "Cust", GicType.USE_GIC);
		
		
		CategorizedPositions position1 = new CategorizedPositions("AABBCCDDE", "0", lProp, lProp, Perspective.SOURCE, 100);
		CategorizedPositions position2 = new CategorizedPositions("FFGGHHIIJ", "0", sProp, sProp, Perspective.SOURCE, 100);
		CategorizedPositions position3 = new CategorizedPositions("KKLLMMNNO", "0", lCust, lCust, Perspective.SOURCE, 100);
		CategorizedPositions position4 = new CategorizedPositions("PPQQRRSST", "0", sCust, sCust, Perspective.SOURCE, 100);
		
		CategorizedPositions aPosition1 = new CategorizedPositions("AABBCCDDE", "0", lProp, lProp, Perspective.USE, 100);
		CategorizedPositions aPosition2 = new CategorizedPositions("FFGGHHIIJ", "0", sProp, sProp, Perspective.USE, 100);
		CategorizedPositions aPosition3 = new CategorizedPositions("KKLLMMNNO", "0", lCust, lCust, Perspective.SOURCE, -100);
		CategorizedPositions aPosition4 = new CategorizedPositions("PPQQRRSST", "0", sCust, sCust, Perspective.SOURCE, -100);
		
		List<CategorizedPositions> positions = Arrays.asList(position1, position2, position3, position4, aPosition1, aPosition2, aPosition3, aPosition4);
		System.out.println("Initial List: " + positions);
		Collections.sort(positions, Comparator.comparing(CategorizedPositions::getAccount));
		
		System.out.println("Sorted List: "+ positions);
	}
}

enum GicType {
	SOURCE_GIC, USE_GIC
}
class OofaCategory {
	public OofaCategory(String code, String description, String group, GicType gicType) {
		super();
		this.code = code;
		this.description = description;
		this.group = group;
		this.gicType = gicType;
	}
	private String code;
	private String description;
	private String group;
	private GicType gicType;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	public GicType getGicType() {
		return gicType;
	}
	public void setGicType(GicType gicType) {
		this.gicType = gicType;
	}
}

enum Perspective {
	SOURCE, USE
}

class CategorizedPositions {
	public CategorizedPositions(String account, String accountType, OofaCategory useCategory,
			OofaCategory sourceCategory, Perspective perspective, double quantity) {
		super();
		this.account = account;
		this.accountType = accountType;
		this.useCategory = useCategory;
		this.sourceCategory = sourceCategory;
		this.perspective = perspective;
		this.quantity = quantity;
	}
	private String account;
	private String accountType;
	private OofaCategory useCategory;
	private OofaCategory sourceCategory;
	private Perspective perspective;
	private double quantity;
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public OofaCategory getUseCategory() {
		return useCategory;
	}
	public void setUseCategory(OofaCategory useCategory) {
		this.useCategory = useCategory;
	}
	public OofaCategory getSourceCategory() {
		return sourceCategory;
	}
	public void setSourceCategory(OofaCategory sourceCategory) {
		this.sourceCategory = sourceCategory;
	}
	public Perspective getPerspective() {
		return perspective;
	}
	public void setPerspective(Perspective perspective) {
		this.perspective = perspective;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "CategorizedPositions [account=" + account + ", accountType=" + accountType + ", useCategory="
				+ useCategory + ", sourceCategory=" + sourceCategory + ", perspective=" + perspective + ", quantity="
				+ quantity + "]";
	}
}
