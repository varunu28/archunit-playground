import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.lang.ArchRule;
import com.tngtech.archunit.lang.syntax.ArchRuleDefinition;
import java.util.List;
import java.util.Set;
import org.junit.jupiter.api.Test;

public class DataTypeImportTest {

    @Test
    void moduleoneShouldNotImportSet() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("com.varunu28.moduleone");

        ArchRule rule = ArchRuleDefinition.noClasses()
            .should().dependOnClassesThat().areAssignableTo(Set.class);

        rule.check(importedClasses);
    }

    @Test
    void moduletwoShouldNotImportList() {
        JavaClasses importedClasses = new ClassFileImporter().importPackages("com.varunu28.moduletwo");

        ArchRule rule = ArchRuleDefinition.noClasses()
            .should().dependOnClassesThat().areAssignableTo(List.class);

        rule.check(importedClasses);
    }
}
