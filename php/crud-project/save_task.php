<?php

    include ("db.php");

    if (isset($_POST['save_task'])) {
        echo "guardando...";
        $title = $_POST['title'];
        $description = $_POST['description'];
        echo "<br>".$title."<br>".$description;

        $query = "INSERT INTO task(title, description) VALUES ('$title', '$description')";
        $result = mysqli_query($conn, $query);

        if (!$result) {
            die("Query failed! 123");
        }

        // bootstrap!
        $_SESSION['message'] = 'Task saved!';
        $_SESSION['message_type'] = 'success';
        // esto es el color verde del cartel de éxito, danger es rojo

        header("Location: index.php");

    }
?>