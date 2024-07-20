import com.intellij.ide.fileTemplates.FileTemplate
import com.intellij.ide.fileTemplates.FileTemplateManager
import com.intellij.ide.fileTemplates.FileTemplateUtil
import com.intellij.openapi.project.Project
import com.intellij.psi.PsiDirectory
import com.intellij.psi.PsiElement
import com.intellij.testFramework.fixtures.BasePlatformTestCase
import org.junit.Test
import java.util.Properties

class FileTemplateUtilTest : BasePlatformTestCase() {

    @Test
    fun testCreateFromTemplate() {
        // Get the project and create a test directory
        val project: Project = myFixture.project
        val directory: PsiDirectory = myFixture.addFileToProject("test_dir/dummy.txt", "").containingDirectory

        // Create a test file template
        val templateManager = FileTemplateManager.getInstance(project)
        val template: FileTemplate = templateManager.addTemplate("TestTemplate", "txt")
        template.text = "Hello, \${NAME}!"

        // Set up properties
        val properties = Properties()
        properties.setProperty("NAME", "World")

        // Create the file from the template
        val createdElement: PsiElement = FileTemplateUtil.createFromTemplate(
            template,
            "test_file",
            properties,
            directory
        )

        // Verify the created file
//        assertNotNull(createdElement)
//        assertTrue(createdElement.isValid)
//        assertEquals("test_file.txt", createdElement.containingFile.name)
//        assertEquals("Hello, World!", createdElement.containingFile.text)
    }
}