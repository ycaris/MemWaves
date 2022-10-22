using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class MoveByTouch : MonoBehaviour
{
    public GameObject SelectedPiece;


    // Update is called once per frame
    void Update()
    {
        if (Input.GetMouseButtonDown(0) || Input.touchCount > 0){
            RaycastHit2D hit = Physics2D.Raycast(Camera.main.ScreenToWorldPoint(Input.mousePosition), Vector2.zero);
            if (hit.transform.CompareTag("Puzzle")){
                if(!hit.transform.GetComponent<PiecesScript>().InRightPosition){
                    SelectedPiece = hit.transform.gameObject;
                    SelectedPiece.GetComponent<PiecesScript>().Selected = true;
                }
            }
            // Touch touch =  Input.GetTouch(0);
            // Vector3 touchPosition = Camer.main.ScreenToWorldPoint(touch.position);
            // touchPosition.z = 0f;
            // if (hit.transform.CompareTag("Puzzle")){
            //     if(!hit.transform.GetComponent<PiecesScript>().InRightPosition){
            //         SelectedPiece.position = touchPosition;
            //         SelectedPiece.GetComponent<PiecesScript>().Selected = true;
            //     }
            // }
        }
        if (Input.GetMouseButtonUp(0)){
            SelectedPiece.GetComponent<PiecesScript>().Selected = false;
            SelectedPiece = null;
        }

        if (SelectedPiece != null){
            Vector3 MousePoint = Camera.main.ScreenToWorldPoint(Input.mousePosition);
            SelectedPiece.transform.position = new Vector3(MousePoint.x, MousePoint.y, 0);

            // Vector3 TouchPoint = Camera.main.ScreenToWorldPoint(Input.GetTouch(0));
            // SelectedPiece.transform.position = new Vector3(TouchPoint.x, TouchPoint.y, 0);
        }
    }
}
